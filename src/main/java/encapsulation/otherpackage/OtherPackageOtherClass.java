package encapsulation.otherpackage;

import encapsulation.parentpackage.Parent;

public class OtherPackageOtherClass {
    private void letsTryToUseOtherMethodsFromInstance() {
        Parent parent = new Parent();
        parent.aPublicMethod("I do important things.");
        //int i = parent.aProtectedMethod(1.0);
        //LocalDate myLocalDate = parent.aPackagePrivadeDefaultMethod(LocalDate.now());
        //LocalDate myPrivateLocalDate = parent.aPrivateMethod();
    }

    private void letsTryToUseOtherMethodsAsTheyAre() {
        //aPublicMethod("I do important things.");
        //aProtectedMethod(1.0);
        //aPackagePrivadeDefaultMethod(LocalDate.now());
        //aPrivateMethod();
    }

}