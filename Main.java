import javax.xml.bind.*;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("items.xml");

            JAXBContext jaxbContext = JAXBContext.newInstance(Root.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Root root = (Root) jaxbUnmarshaller.unmarshal(file);

            // Access the Java objects
            Items items = root.getItems();
            for (Item item : items.getItemList()) {
                System.out.println("Name: " + item.getName());
                System.out.println("Price: " + item.getPrice());
                System.out.println();
            }
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
