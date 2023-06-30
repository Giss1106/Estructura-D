
package practica11_sobreescriturau2;

import Animal.Animal;

public class Gato extends Animal{
    //redefinir @Override
    @Override
    public void comer(){
        System.out.println("ABANDONE A MI DUENA :( ");
    }
}
