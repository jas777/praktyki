package com.labfive.jas777.battlesim;

public enum CharacterClass {

    AXE("  ,   A           {}\n" +
        " / \\, | ,        .--.\n" +
        "|    =|= >      /.--.\\\n" +
        " \\ /` | `       |====|\n" +
        "  `   |         |`::`|\n" +
        "      |     .-;`\\..../`;_.-^-._\n" +
        "     /\\\\/  /  |...::..|`   :   `|\n" +
        "     |:'\\ |   /'''::''|   .:.   |\n" +
        "      \\ /\\;-,/\\   ::  |..:::::..|\n" +
        "      |\\ <` >  >._::_.| ':::::' |\n" +
        "      | `\"\"`  /   ^^  |   ':'   |\n" +
        "      |       |       \\    :    /\n" +
        "      |       |        \\   :   /\n" +
        "      |       |___/\\___|`-.:.-`\n" +
        "      |        \\_ || _/    `\n" +
        "      |        <_ >< _>\n" +
        "      |        |  ||  |\n" +
        "      |        |  ||  |\n" +
        "      |       _\\.:||:./_\n" +
        "      |      /____/\\____\\\n", WeaponType.AXE),

    SPEAR("              {}\n" +
          "             .--.\n" +
          "            /.--.\\\n" +
          "            |====|\n" +
          "            |`::`|\n" +
          "        .-;`\\..../`;_.-^-._\n" +
          " /\\\\   /  |...::..|`   :   `|\n" +
          " |:'\\ |   /'''::''|   .:.   |\n" +
          "@|\\ /\\;-,/\\   ::  |..:::::..|\n" +
          "`||\\ <` >  >._::_.| ':::::' |\n" +
          " || `\"\"`  /   ^^  |   ':'   |\n" +
          " ||       |       \\    :    /\n" +
          " ||       |        \\   :   /\n" +
          " ||       |___/\\___|`-.:.-`\n" +
          " ||        \\_ || _/    `\n" +
          " ||        <_ >< _>\n" +
          " ||        |  ||  |\n" +
          " ||        |  ||  |\n" +
          " ||       _\\.:||:./_\n" +
          " \\/      /____/\\____\\\n", WeaponType.SPEAR);

    private final String art;
    private final WeaponType weapon;

    CharacterClass(String art, WeaponType weapon) {
        this.art = art;
        this.weapon = weapon;
    }

    public String getArt() {
        return art;
    }

    public WeaponType getWeapon() {
        return weapon;
    }
}
