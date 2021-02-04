
package visualiser;

class Stack extends Deque{
    public Stack(Controller controller, int listType) {
        super(controller, listType);
    }
    public void add(Vertex node){
        super.push(node);
    }
    public Vertex remove(){
        return super.pop();
    }
}
