package com.mygdx.game;

import com.badlogic.gdx.Game;

public class Drop extends Game {
    public int stage = 0;
    public int coin;
    String[] whatspells = "20301010101".split("0");
    //String whatsend = "20301010101";
    String[] enemywhatspells = "80901010101".split("0");
    //String enemywhatsend = "80901010101";
    int maxhealth = 10, maxmana = 50, moddef = 0, modcontrol = 0, modattack = 0;
    int startmaxhealth = 10, startmaxmana = 50, startmoddef = 0, startmodcontrol = 0, startmodattack = 0;
    int enemymaxhealth = 10, enemymaxmana = 50, enemymoddef = 0, enemymodcontrol = 0, enemymodattack = 0;
    int chmaxhealth = 0, chmaxmana = 0, chmodattack = 0, chmoddef = 0, chmodcontrol = 0;

    @Override
    public void create() {
        this.setScreen(new MainMenuScreen(this));
    }

    @Override
    public void render() {
        super.render();
    }

    @Override
    public void dispose() {super.dispose();}


    public void setbegin(){
        stage = 0;
        enemymaxhealth = 10;
        enemymaxmana = 50;
        enemymoddef = 0;
        enemymodcontrol = 0;
        enemymodattack = 0;
        enemywhatspells = "80901010101".split("0");
        maxhealth = startmaxhealth;
        maxmana = startmaxmana;
        moddef = startmoddef;
        modcontrol = startmodcontrol;
        modattack = startmodattack;
        whatspells = "20301010101".split("0");
    }

    public void setCoin(int coin){
        this.coin = coin;
    }
    public void setMaxhealth(int maxhealth) {
        this.startmaxhealth = maxhealth;
        this.maxhealth = startmaxhealth;
    }
    public void setMaxmana(int maxmana) {
        this.startmaxmana = maxmana;
        this.maxmana = this.startmaxmana;
    }
//    public void setSpellswhat(String what) {
//        whatsend = what;
//        whatspells = what.split("0");
//
//    }
    public void setModdef(int moddef) {
        this.startmoddef = moddef;
        this.moddef = this.startmoddef;
    }
    public void setModcontrol(int modcontrol) {
        this.startmodcontrol = modcontrol;
        this.modcontrol = this.startmodcontrol;
    }
    public void setModattack(int modattack) {
        this.startmodattack = modattack;
        this.modattack = this.startmodattack;
    }



//    public void enemysetMaxhealth(int maxhealth) {this.enemymaxhealth = maxhealth;}
//    public void enemysetMaxmana(int maxmana) {this.enemymaxmana = maxmana;}
//    public void enemysetSpellswhat(String what) {
//        enemywhatsend = what;
//        enemywhatspells = what.split("0");
//    }
//    public void enemysetModdef(int enemymoddef) {
//        this.enemymoddef = enemymoddef;
//    }
//    public void enemysetModcontrol(int enemymodcontrol) {
//        this.enemymodcontrol = enemymodcontrol;
//    }
//    public void enemysetModattack(int enemymodattack) {
//        this.enemymodattack = enemymodattack;
//    }
    public String[] changedb(){
        String[] send = new String[]{String.valueOf(maxhealth + chmaxhealth), String.valueOf(maxmana + chmaxmana), whatspells[0] +"0"+ whatspells[1] +"0"+ whatspells[2] +"0"+ whatspells[3] +"0"+whatspells[4] +"0"+ whatspells[5], String.valueOf(modattack + chmodattack), String.valueOf(moddef + chmoddef), String.valueOf(modcontrol + chmodcontrol), String.valueOf(coin)};
        return send;
    }
//    public String[] enemychangedb(){
//        String[] enemywhatsend = new String[]{String.valueOf(enemymaxhealth), String.valueOf(enemymaxmana), enemywhatspells[0] +"0"+ enemywhatspells[1] +"0" + enemywhatspells[2] +"0" + enemywhatspells[3] +"0" + enemywhatspells[4] +"0" + enemywhatspells[5], String.valueOf(enemymodattack), String.valueOf(enemymoddef), String.valueOf(enemymodcontrol)};
//        return enemywhatsend;
//    }
}