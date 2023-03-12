package InterfacesAndAbstractionExercises._07_CollectionHierarchy;

public class AddCollection extends Collection implements Addable{




    @Override
    public int add(String element) {
      super.items.add(element);
        return items.indexOf(element);
    }
}
