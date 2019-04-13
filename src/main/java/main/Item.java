package main;
public class Item{
    public String itemName;
    public int mrp;
    public  void addItem(String itemName,int mrp){   //mrpItem
        //code here
    	this.itemName = itemName;
    	this.mrp = mrp;

    }
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getMrp() {
		return mrp;
	}
	public void setMrp(int mrp) {
		this.mrp = mrp;
	}
    
}