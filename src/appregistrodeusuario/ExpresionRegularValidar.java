/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appregistrodeusuario;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Ale
 */
public class ExpresionRegularValidar {
    private static Pattern patternNomUsuario = Pattern.compile("[A-Za-z0-9_-]{5,13}");
    private static Pattern patternCorreo = Pattern.compile("([a-zA-Z0-9_])+(@)(gmail|outlook|jcarlos19)(.com)");
    private static Pattern patternTel = Pattern.compile("871\\d{7}");
    private static Pattern patternNumControl = Pattern.compile("\\d{2}13\\d{4}");
    private static Pattern patternNacimiento = Pattern.compile("(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-](\\d{4})");
    private static Pattern patternContrasena = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*()_+\\[\\]{};':\"\\|,.<>?]).{8,13}$");
    
    public static boolean validarUsario(String s){
        Matcher matcherNomUs = patternNomUsuario.matcher(s);
        return matcherNomUs.matches();
    }
    
    public static boolean validarCorreo(String s){
        Matcher matcherNomUs = patternCorreo.matcher(s);
        return matcherNomUs.matches();
    }
    
    public static boolean validarTel(String s){
        Matcher matcherNomUs = patternTel.matcher(s);
        return matcherNomUs.matches();
    }
    
    public static boolean validarNumControl(String s){
        Matcher matcherNomUs = patternNumControl.matcher(s);
        return matcherNomUs.matches();
    }
    
    public static boolean validarNacimiento(String s){
        Matcher matcherNomUs = patternNacimiento.matcher(s);
        return matcherNomUs.matches();
    }
    
    public static boolean validarContrasena(String s){
        Matcher matcherNomUs = patternContrasena.matcher(s);
        return matcherNomUs.matches();
    }
    
}
