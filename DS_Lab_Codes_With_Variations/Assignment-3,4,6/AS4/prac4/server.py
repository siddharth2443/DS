import socket
import time

class BerkeleyServer:
    def __init__(self, port):
        self.port = port
        self.server_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
        self.client_offsets = {}

    def start(self):
        self.server_socket.bind(('localhost', self.port))
        self.server_socket.listen(5)
        print("Server is listening...")

        while True:
            client_socket, addr = self.server_socket.accept()
            print(f"Connected to {addr}")

            offset = self._calculate_offset()
            self.client_offsets[addr] = offset
            print(f"Offset calculated with {addr}: {offset}")

            client_socket.send(str(offset).encode())
            client_socket.close()

    def _calculate_offset(self):
        return time.time()

# Example usage
server = BerkeleyServer(12345)  # Replace 12345 with your desired port
server.start()
