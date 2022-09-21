public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        var dog = 8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        System.out.println(dog);
        double dogSmall = dog - 3.5;
        System.out.println(dogSmall);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = ((paper + 4) - 7639);
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        var firstManWeight = 78.2;
        var secondManWeight = 82.7;
        var menWeight = firstManWeight + secondManWeight;
        var weightDifferenceMan = secondManWeight - firstManWeight;
        System.out.println("общий вес мужчин" + menWeight);
        System.out.println("разница в веса мужчин" + weightDifferenceMan + "кг!");
        var weightDistinctionMan = secondManWeight % firstManWeight;
        System.out.println("отличие в весе мужчин" + weightDistinctionMan + "кг!");
        var totalTime = 640;
        var personTime = 8;
        var totalPerson = 640 / 8;
        var workings = 640 / 8 + 94;
        var inTotalTime = ((640 / 8 + 94) * 8);
        System.out.println("Если в компании работает " + workings + " человек!+то всего часов работы " + inTotalTime + " часов!");
    }
}




