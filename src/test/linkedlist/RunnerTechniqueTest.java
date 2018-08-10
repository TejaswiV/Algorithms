package linkedlist;

import com.teju.algorithms.linkedlist.LinkedList;
import com.teju.algorithms.linkedlist.RunnerTechnique;
import org.junit.Before;
import org.junit.Test;

public class RunnerTechniqueTest {

    LinkedList<String> list;
    RunnerTechnique runner;

    @Before
    public void setUp(){
        runner = new RunnerTechnique();
        list= new LinkedList<>();
        list.append("a2");
        list.prepend("a1");
        list.append("a3");
        list.append("a4");
        list.append("a5");
        list.append("b1");
        list.append("b2");
        list.append("b3");
        list.append("b4");
        list.append("b5");
    }

    @Test
    public void testRearrange(){
        list.printList();
        runner.rearrange(list);
        list.printList();
    }
}
