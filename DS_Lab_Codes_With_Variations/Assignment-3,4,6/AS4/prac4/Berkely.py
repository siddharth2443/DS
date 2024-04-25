import time
import random

class BerkeleyClockSynchronization:
    def __init__(self, machines):
        self.machines = machines
        self.offsets = {}

    def synchronize(self):
        for machine in self.machines:
            offset = self._calculate_offset(machine)
            self.offsets[machine] = offset

        self._adjust_clocks()

    def _calculate_offset(self, machine):
        local_time = time.time()
        machine_time = self.get_machine_time(machine)
        return machine_time - local_time

    def get_machine_time(self, machine):
        # Simulate getting time from remote machine (replace with actual mechanism)
        # Here, we just simulate by adding a random delay
        delay = random.uniform(0, 0.1)
        return time.time() + delay

    def _adjust_clocks(self):
        average_offset = sum(self.offsets.values()) / len(self.offsets)
        for machine, offset in self.offsets.items():
            corrected_time = time.time() + average_offset - offset
            print(f"Adjusting clock of {machine} to {corrected_time}")

# Example usage
machines = ["Machine1", "Machine2", "Machine3"]  # Replace with actual machine names
synchronizer = BerkeleyClockSynchronization(machines)
synchronizer.synchronize()
