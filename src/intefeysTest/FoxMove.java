package intefeysTest;

class FoxMove{

private String name;

    FoxMove(String name){
        this.name = name;
    }
//    @Override
//    public void foxen() {
//        System.out.println("Home");
//    }

    @Override

    public boolean equals(Object object){
        if(!(object instanceof FoxMove)) return false;

        FoxMove fox = (FoxMove) object;
        return this.name.equals(fox.name);
    }
}
