/**
 * Created by justin on 3/23/2016.
 */
public class MyLinkedList implements NodeList{
    private ListItem root = null;

    public MyLinkedList (ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if(this.root == null) {
            //List was empty - this item becomes head
            this.root = newItem;
            return true;
        }

        ListItem currentItem = this.root;

        while(currentItem != null) {
            int comparison = (currentItem.compareTo(newItem));
            if(comparison < 0) {
                //currentItem < newItem, add newItem to the right (greater than direction)
                currentItem.setNext(newItem);
                newItem.setPrevious(currentItem);
                return true;
            }
            else if (comparison > 0) {
                //currentItem > newItem, add newItem to the left (less than direction)
                if(currentItem.previous() != null) {
                    currentItem.previous().setNext(newItem);
                    newItem.setPrevious(currentItem.previous());
                    newItem.setNext(currentItem);
                    currentItem.setPrevious(newItem);
                } else {
                    newItem.setNext(this.root);
                    this.root.setPrevious(newItem);
                    this.root = newItem;
                }
            }
            else {
                // currentItem and newItem are equal
                System.out.println(newItem.getValue()  + " already present, not added.");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        return false;
    }

    @Override
    public void traverse(ListItem root) {

    }
}

