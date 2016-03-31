/**
 * Created by justin on 3/26/2016.
 */
public class NodeListTest {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList(null);

        list.traverse(list.getRoot());

        String cities = "Beckley Charleston Huntington Summersville Parkersburg Pool Mt_Lookout Clarksburg Morgantown";

        for(String city: cities.split(" ")) {
            list.addItem(new Node(city));
        }

        list.traverse(list.getRoot());

        list.removeItem(new Node("Mt_Lookout"));

        list.traverse(list.getRoot());
    }
}
