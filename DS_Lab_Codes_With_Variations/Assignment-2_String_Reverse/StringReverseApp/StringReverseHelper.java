package StringReverseApp;


/**
* StringReverseApp/StringReverseHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from StringReverse.idl
* Thursday, 25 May, 2023 5:37:49 AM IST
*/

abstract public class StringReverseHelper
{
  private static String  _id = "IDL:StringReverseApp/StringReverse:1.0";

  public static void insert (org.omg.CORBA.Any a, StringReverseApp.StringReverse that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static StringReverseApp.StringReverse extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (StringReverseApp.StringReverseHelper.id (), "StringReverse");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static StringReverseApp.StringReverse read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_StringReverseStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, StringReverseApp.StringReverse value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static StringReverseApp.StringReverse narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof StringReverseApp.StringReverse)
      return (StringReverseApp.StringReverse)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      StringReverseApp._StringReverseStub stub = new StringReverseApp._StringReverseStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static StringReverseApp.StringReverse unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof StringReverseApp.StringReverse)
      return (StringReverseApp.StringReverse)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      StringReverseApp._StringReverseStub stub = new StringReverseApp._StringReverseStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
