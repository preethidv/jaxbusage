import javax.xml.bind.annotation.*;

@XmlRootElement(name = "root")
@XmlAccessorType(XmlAccessType.FIELD)
public class Root {
    @XmlElement(name = "items")
    private Items items;

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }
}
