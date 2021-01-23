 private static void addVideoTo(List<YouTubeVideo> vids) {
    Scanner kbd = new Scanner(System.in);
    System.out.print("Name of video to add? ");
    String nameOfVideo = kbd.nextLine();

    System.out.println();

    System.out.print("Name of creator? ");
    String nameOfCreator = kbd.nextLine();

    System.out.println();

    vids.add(hackedVideo(nameOfVideo, nameOfCreator));
  }
  
  private static YouTubeVideo hackedVideo(String nameOfVideo, String nameOfCreator) {
    LocalDate hackedDate = LocalDate.of(2020, 12, 29);
    return new YouTubeVideo(
        nameOfVideo, nameOfCreator, hackedDate, Duration.ofSeconds(600), 0, 0, 0, List.of());
  }

  private static List<YouTubeVideo> loadedVids() {
    List<YouTubeVideo> vids = new ArrayList<>();
    vids.add(
        new YouTubeVideo(
            "My Cat, My Killer",
            "stubblyBeast",
            LocalDate.of(2020, 12, 29),
            Duration.ofSeconds(143),
            0,
            0,
            0,
            List.of()));
    vids.add(
        new YouTubeVideo(
            "Fashion Coward - SNL",
            "Saturday Night Live",
            LocalDate.of(2019, 4, 13),
            Duration.ofSeconds(123),
            3_920_363,
            75_000,
            915,
            List.of(
                "I somehow feel attacked and comforted at the same time",
                "Pants for the legs revolutionary",
                "You really didn't have to expose me like this")));
    vids.add(
        new YouTubeVideo(
            "Playing an RPG for the first time",
            "Joel Haver",
            LocalDate.of(2020, 11, 20),
            Duration.ofSeconds(188),
            2_004_937,
            233_000,
            1_600,
            List.of(
                "There is probably a reason your character started out in a prison...",
                "I used to have rats so I really appreciate this. Justice for Marshall.",
                "Recommended to me 3 times. Watched 3 times. laughed 3 times.",
                "The quiet sobbing sells the joke much more than hysterical crying would")));
    vids.add(
        new YouTubeVideo(
            "Nice Stub",
            "Hans Hans",
            LocalDate.of(2020, 11, 21),
            Duration.ofSeconds(188),
            0,
            2,
            1,
            Collections.emptyList()));

    return vids;
  }
