
package visualiser;

class Queue extends Deque{
    Queue(Controller controller, int listType) {
        super(controller, listType);
    }
    public void add(Vertex node){
        super.enqueue(node);
    }
    public Vertex remove(){
        return super.dequeue();
    }
}
