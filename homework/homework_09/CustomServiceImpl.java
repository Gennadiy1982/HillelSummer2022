package homework_09;

import java.util.Collection;

public class CustomServiceImpl<String> implements CustomCollection<String> {

    static class Node<String> {
        String value;
        Node<String> next;

        public Node(String value) {
            this.value = value;
            this.next = null;
        }
    }

    private Node<String> head;
    private int size;

    @Override
    public boolean add(String str) {
        if (size() == 0) {
            head = new Node<>(str);
        } else {
            Node<String> current = head;
            Node<String> node = new Node<>(str);
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
            node.next = null;
        }
        size++;
        return true;
    }

    @Override
    public boolean addAll(Collection strCol) {
        if (strCol == null || strCol.size() == 0) {
            return false;
        }
        for (Object s : strCol) {
            add((String)s);
        }
        return true;
    }

    @Override
    public boolean delete(int index) {
        if (size() == 0) {
            return false;
        }
        if (index < 0 || index > size()) {
            return false;
        }
        Node<String> current = head;
        Node<String> prev = null;
        int i = -1;
        while (current != null) {
            i++;
            if (i == index) {
                if (prev == null) {
                    head = head.next;
                } else {
                    prev.next = current.next;
                }
                size--;
                return true;
            }
            prev = current;
            current = current.next;
        }
        return false;
    }

    @Override
    public boolean delete(String str) {
        Node<String> current = head;
        Node<String> prev = null;
        if (size() == 0) {
            return false;
        }
        while (current != null) {
            if (current.value.equals(str)) {
                if (prev == null) {
                    head = head.next;
                } else {
                    prev.next = current.next;
                }
                size--;
                return true;
            }
            prev = current;
            current = current.next;
        }
        return false;
    }

    @Override
    public String get(int index) {
        int i = -1;
        if (size() == 0) {
            return null;
        }
        if (index < 0 || index > size()) {
            return null;
        }
        Node<String> current = head;
        while (current != null) {
            i++;
            if (i == index) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }

    @Override
    public boolean contains(String str) {
        if (size() == 0) {
            return false;
        }
        Node<String> current = head;
        for (int i = 0; i < size; i++) {
            if (current.value.equals(str)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public boolean clear() {
        head = null;
        size = 0;
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean trim() {
        return true;
    }
}
