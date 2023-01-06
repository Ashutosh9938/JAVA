import java.awt.*;
class MenuA extends Frame{
Menu file,edit,n;
MenuItem save,java,oop;
MenuBar bar;
public MenuA(){
setSize(400,500);
bar=new MenuBar();
setMenuBar(bar);
Menu file=new Menu("file");
bar.add(file);
Menu edit=new Menu("edit");
bar.add(edit);
n=new Menu("new");
file.add(n);
save=new MenuItem("save");
file.add(save);
java=new MenuItem("java");
n.add(java);
oop=new MenuItem("c++");
n.add(oop);
setLayout(null);
setVisible(true);

}
public static void main(String[]args){
new MenuA();
}
}