class Tree{
  private String treeName;
  private String treeType;
  private String leafColor;
  private boolean leavesFall;

  Tree() {
    treeName = "";
    treeType = "";
    leafColor = "";
    leavesFall = false;
  }

  Tree(String aTreeName, String aTreeType, String aLeafColor, boolean aLeavesFall) {
    treeName = aTreeName;
    treeType = aTreeType;
    leafColor = aLeafColor;
    leavesFall = aLeavesFall;
  }

  void setTreeName(String aTreeName){
    treeName = aTreeName;
  }

  void setTreeType(String aTreeType) {
    treeType = aTreeType;
  }

  void setLeafColor(String aLeafColor) {
    leafColor = aLeafColor;
  }

  void setLeavesFall(boolean aLeavesFall) {
    leavesFall = aLeavesFall;
  }

  String getTreeName(){
    return treeName;
  }

  String getTreeType(){
    return treeType;
  }

  String getLeafColor() {
    return leafColor;
  }

  boolean getLeavesFall(){
    return leavesFall;
  }

  void print(){
    if(leavesFall){
  System.out.println("This is a " + treeName + " tree. It is a " + treeType + " and its leaves are currently " + leafColor + ". It does lose its leaves for winter.");
   
  } else {
    System.out.println("This is a " + treeName + " tree. It is a " + treeType + " and its leaves are currently " + leafColor + ". It does not lose its leaves for winter.");

  }

 }
  
}