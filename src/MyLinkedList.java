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
            // List was empty - this item becomes root
            this.root = newItem;
            return true;
        }

        ListItem currentItem = this.root;
        while(currentItem != null) {
            int comparison = (currentItem.compareTo(newItem));
            if(comparison < 0) {
                // newItem is greater, move right until it currentItem is greater or end of list reached
                if(currentItem.next() != null) {
                    // move right, run loop again
                    currentItem = currentItem.next();
                } else {
                    // currentItem is last in list, can't move right
                    currentItem.setNext(newItem);
                    newItem.setPrevious(currentItem);
                    return true;
                }
            } else if (comparison > 0) {
                // currentItem > newItem, add newItem to the left (less than direction)
                if(currentItem.previous() != null) {
                    currentItem.previous().setNext(newItem);
                    newItem.setPrevious(currentItem.previous());
                    newItem.setNext(currentItem);
                    currentItem.setPrevious(newItem);
                } else {
                    // currentItem is first in the list, insert newItem as root
                    newItem.setNext(this.root);
                    this.root.setPrevious(newItem);
                    this.root = newItem;
                }
                return true;
            }
            else {
                // currentItem and newItem are equal
                System.out.println(newItem.getValue()  + " already present, not added.");
                return false;
            }
        }
        return false; // Should never execute
    }

    @Override
    public boolean removeItem(ListItem itemToRemove) {
        if(itemToRemove != null) {
            System.out.println("Deleting item " + itemToRemove.getValue());
        }

        ListItem currentItem = this.root;
        while(currentItem != null) {
            int comparison = currentItem.compareTo(itemToRemove);
            if(comparison == 0) {
                //found a match
                if(currentItem == this.root) {
                    this.root = currentItem.next();
                } else {
                    currentItem.previous().setNext(currentItem.next());
                    if(currentItem.next() != null)
                    {
                        currentItem.next().setPrevious(currentItem.previous());
                        return true;
                    }
                }
            } else if(comparison < 0) {
                // Haven't reached matching item - move to the right
                currentItem = currentItem.next();
            } else if(comparison > 0) {
                // Gone beyond where matching value would be - value not in list
                System.out.println(itemToRemove.getValue() + " not in list.");
                return false;
            }
        }
        // reached end of list with no matching value
        System.out.println(itemToRemove.getValue() + " not in list.");
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root == null) {
            System.out.println("The list is empty.");
        } else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }
    }
}

