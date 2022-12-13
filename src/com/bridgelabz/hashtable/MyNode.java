package com.bridgelabz.hashtable;
/**
public class MyNode<K> implements INode<K> {
    private K key;
    private INode<K> next;

    public MyNode(K key){
        this.key=key;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public void setKey(K key) {
       this.key=key;
    }

    @Override
    public INode<K> getNext() {
        return next;
    }

    @Override
    public void setNext(INode<K> next) {
       this.next=next;
    }

    @Override
    public String toString() {
        StringBuffer nodeString=new StringBuffer();
        nodeString.append(key).append("->");
        if (next!=null)
            nodeString.append(" , ").append(next);
        return nodeString.toString();
    }
}**/
