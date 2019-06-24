public class Main {

  public static void main(String[] args) {
    System.out.println(whoLikesIt());
    System.out.println(whoLikesIt("Peter"));
    System.out.println(whoLikesIt("Jacob", "Alex"));
    System.out.println(whoLikesIt("Max", "John", "Mark"));
    System.out.println(whoLikesIt("Alex", "Jacob", "Mark", "Max"));
    System.out.println(whoLikesIt("Alex", "Jacob", "Mark", "Max", "blabla"));
  }

  public static String whoLikesIt(String... names) {
    //Do your magic here
    StringBuilder sb = new StringBuilder();
    if (names.length == 0) {
      sb.append("no one");
    } else if (names.length == 1) {
      sb.append(names[0]);
    } else if (names.length == 2) {
      sb.append(names[0]);
      sb.append(" and ");
      sb.append(names[1]);
    } else if (names.length == 3) {
      sb.append(names[0]);
      sb.append(", ");
      sb.append(names[1]);
      sb.append(" and ");
      sb.append(names[2]);
    } else {
      sb.append(names[0]);
      sb.append(", ");
      sb.append(names[1]);
      sb.append(" and ");
      sb.append(names.length - 2);
      sb.append(" others");
    }

    if (names.length < 2) {
      sb.append(" likes this");
    } else {
      sb.append(" like this");
    }

    return sb.toString();
  }
}
