import java.io.*;
import java.util.Arrays;

public class SerializationUtils {
    public static void main(String[] args) {
        String filename = "citizens.data";
        try {
            SerializationUtils.serialize(initCitizens(), filename);
            Citizen[] citizens = (Citizen[]) SerializationUtils.deserialize(filename);
            System.out.println(Arrays.toString(citizens));
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Citizen[] initCitizens() {
        Citizen mark = new Citizen();
        mark.setName("Mark Olson");
        mark.setPassport("503143798"); // the password was set

        Address markAddress = new Address();
        markAddress.setState("Arkansas");
        markAddress.setCity("Conway");

        mark.setAddress(markAddress);

        Citizen anna = new Citizen();
        anna.setName("Anna Flores");
        mark.setPassport("605143321"); // the password was set

        Address annaAddress = new Address();
        annaAddress.setState("Georgia");
        annaAddress.setCity("Atlanta");

        anna.setAddress(annaAddress);

        return new Citizen[]{ mark, anna };
    }

    public static void serialize(Object obj, String fileName) throws IOException {
        FileOutputStream fos = new FileOutputStream(fileName);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(obj);
        oos.close();
    }

    public static Object deserialize(String fileName) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);
        Object obj = ois.readObject();
        ois.close();
        return obj;
    }
}
