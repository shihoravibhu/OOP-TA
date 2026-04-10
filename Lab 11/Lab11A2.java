// 2. Create interface EventListener with performEvent() method. Create MouseListener 
// interface which inherits EventListener along with mouseClicked(), mousePressed(), 
// mouseReleased(), mouseMoved(), mouseDragged() methods. Also create KeyListener 
// interface which inherits EventListener along with keyPressed(), keyReleased() methods. 
// WAP to create EventDemo class which implements MouseListener and KeyListener and 
// demonstrate all the methods of the interfaces. [A] 

interface EventListener{

    void performEvent() ;

}

interface MouseListener extends EventListener{
    void mouseClicked();
    void mousePressed(); 
    void mouseReleased();
    void mouseMoved();
    void mouseDragged();

} 

interface KeyListener extends EventListener{

    void keyPressed();
    void keyReleased();

}

class EventDemo implements MouseListener,KeyListener{

    @Override
    public void performEvent() {

        System.out.println("PerformEvent..");
        
    }
    
    @Override
    public void keyPressed() {
        System.out.println("KeyPressed..");
        
    }
    
    @Override
    public void keyReleased() {
        System.out.println("KeyReleased..");
        
    }
    
    @Override
    public void mouseClicked() {
        System.out.println("MouseClikced..");
        
    }
    
    @Override
    public void mousePressed() {
        System.out.println("MousePressed..");
        
    }
    
    @Override
    public void mouseReleased() {
        System.out.println("MouseReleased..");
        
    }
    
    @Override
    public void mouseMoved() {
        System.out.println("MouseMoved..");
        
    }
    
    @Override
    public void mouseDragged() {
        System.out.println("MouseDragged..");
        
    }   

}


public class Lab11A2 {
        public static void main(String[] args) {

        EventDemo obj = new EventDemo();

        obj.performEvent();
        obj.keyPressed();
        obj.keyReleased();
        obj.mouseClicked();
        obj.mousePressed();
        obj.mouseReleased();
        obj.mouseMoved();
        obj.mouseDragged();
        
    }
    
}
