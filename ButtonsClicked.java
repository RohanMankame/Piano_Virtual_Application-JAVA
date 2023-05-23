/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Piano_Keyboard;

/**
 *
 * @author Rohan_nu3d8wo
 */
//Used to keep track of buttons pressed by storing keys into arraylist
class ButtonsClicked {
    
    public String buttonPressed;
    public String min;
    public int sec;
    public String keyClicked;
    public Boolean Click;

    public String getButtonPressed() {
        return buttonPressed;
    }

    public void setButtonPressed(String buttonPressed) {
        this.buttonPressed = buttonPressed;
    }
    
    //Parameters 
    public ButtonsClicked(String buttonPressed) {
        this.buttonPressed = buttonPressed;
    }
    
    public String timer() {
        return min + sec;
        
    }

    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }
    
    public Boolean keyClicker() {
        return Click;
        
    }

    public String getKeyClicked() {
        return keyClicked;
    }

    public void setKeyClicked(String keyClicked) {
        this.keyClicked = keyClicked;
    }

    public Boolean getClick() {
        return Click;
    }

    public void setClick(Boolean Click) {
        this.Click = Click;
    }
    
}
