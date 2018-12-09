package Year2018;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by arenaq on 08.12.2018.
 */
public class Day7 {
    static String input = "Step C must be finished before step A can begin.;Step C must be finished before step F can begin.;Step A must be finished before step B can begin.;Step A must be finished before step D can begin.;Step B must be finished before step E can begin.;Step D must be finished before step E can begin.;Step F must be finished before step E can begin.";
    static HashMap<Character, Node> origins = new HashMap<>();

    static class Node {
        char label;
        Node prev;
        ArrayList<Node> list;

        Node(char label) {
            this.label = label;
            list = new ArrayList<>();
        }

        Node(char label, Node prev) {
            this(label);
            this.prev = prev;
        }

        Node next(int i) {
            return list.get(i);
        }
    }

    public static void main(String[] args) {
        // TODO - ulozit do tmp, pak celý smazat
        // TODO - udělat jednoduchej spoják s vkládáním na místo (umí to asi i javovskej) a pak to procházet po jednom a vkládat na místo, kam to patří
        String[] inputArray = input.split(";");
        for (String rule : inputArray) {
            char origin = rule.charAt(5);
            char destination = rule.charAt(36);
            Node originNode = origins.get(origin);
            if (originNode == null) {
                originNode = new Node(origin);
                origins.put(origin, originNode);
            }
            Node destinationNode = origins.get(destination);
            if (destinationNode == null) {
                destinationNode = new Node(destination, originNode);
                origins.put(destination, originNode);
            }
            originNode.list.remove(destinationNode);
            originNode.list.add(destinationNode);
        }
        ArrayList<Node> start = new ArrayList<>();
        for (Map.Entry<Character, Node> entry : origins.entrySet()) {
            Node node = entry.getValue();
            if (node.prev == null) start.add(node);
        }

        Node startNode = getFirst(start);
        while (!startNode.list.isEmpty()) {
            Node first = getFirst(startNode.list);
            startNode.list.remove(first);
            startNode.list.addAll(first.list);
        }
    }

    static Node getFirst(ArrayList<Node> nodes) {
        Node result = nodes.get(0);
        char first = result.label;
        for (Node node : nodes) {
            char label = node.label;
            if (label < first) {
                first = label;
                result = node;
            }
        }
        System.out.print(result.label);
        return result;
    }
}
