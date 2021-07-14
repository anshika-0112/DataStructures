package Tree;

import java.util.ArrayList;

public class SerializeAndDeserialize {
    protected void Serialize(Node root,ArrayList<Integer> a)
    {
        if(root==null)
        {
            a.add(-1);
            return;

        }
        a.add(root.data);
        Serialize(root.left,a);
        Serialize(root.right,a);
    }

    int index=0;
    protected Node Deserialize(ArrayList<Integer> arr) {
        if (arr.get(index) == -1) {
            index++;
            return null;
        }
        int val = arr.get(index);
        index++;
        Node root = new Node(val);
        if (index == arr.size() - 1) {
            return root;
        }
        root.left = Deserialize(arr);
        root.right = Deserialize(arr);
        return root;
    }

    }

