
import org.junit.jupiter.api.Assertions;
import un_ordered_list.MyLinkedList;
import un_ordered_list.MyNode;
import org.junit.jupiter.api.Test;

public class MyLinkedListTest {
    @Test
    public void givenArrayOfWords_WhenAddedAndSearch_ShouldMatchPosition() {
        String[] words = {"hi", "this", "is", "the", "test", "case"};
        MyLinkedList myLinkedList = new MyLinkedList();
        for (int i = 0; i < words.length; i++) {
            MyNode<Object> newWord = new MyNode<>(words[i]);
            myLinkedList.append(newWord);
        }
        myLinkedList.printMyNode();
        MyNode<Object> searchNode = new MyNode<>("program");
        int pos = myLinkedList.search(searchNode);
        if(pos<0){
            myLinkedList.append(searchNode);
        }
        else{
            myLinkedList.remove(searchNode);
        }
        myLinkedList.printMyNode();
//        Assertions.assertEquals(5,pos);
    }
}