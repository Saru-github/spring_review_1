package dataStructure;

public class MyHash {

    public static void main(String[] args) {
        MyHash mainObject = new MyHash(20);
        mainObject.saveData("HEO", "010-7262-7548");
        mainObject.saveData("KIM", "010-1111-1111");
        mainObject.saveData("LEE", "010-7262-7548");
        mainObject.saveData("Lei", "010-3333-3333");
        System.out.println(mainObject.getData("LEE"));
    }
    public Slot[] hashTable;
    public MyHash(Integer size){
        this.hashTable = new Slot[size];
    }
    public class Slot{
        String key;
        String value;
        Slot next;
        Slot(String key, String value){
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }
    public int hashFunc(String key){
        return (int)(key.charAt(0))%this.hashTable.length;
    }
    public boolean saveData(String key, String value){
        Integer address = this.hashFunc(key);
        if(this.hashTable[address] != null){
            Slot findSlot = this.hashTable[address];
            Slot prevSlot = this.hashTable[address];
            while (findSlot != null){
                if(findSlot.key == key){
                    findSlot.value = value;
                    return true;
                } else {
                    prevSlot = findSlot;
                    findSlot = findSlot.next;
                }
            }
            prevSlot.next = new Slot(key, value);
        } else {
            this.hashTable[address] = new Slot(key, value);
        }
        return true;
    }
    public String getData(String key){
        Integer address = this.hashFunc(key);
        if(this.hashTable[address] != null){
            Slot findSlot = this.hashTable[address];
            while(findSlot != null){
                if(findSlot.key == key){
                    return findSlot.value;
                } else {
                    findSlot = findSlot.next;
                }
            }
            return null;
        } else {
            return null;
        }
    }


}
