package org.example.reverseletter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseLetterTest {
    private ReverseLetter reverseLetter = new ReverseLetter();

    //1. Обычный случай — пример из условия: "J@va the be$t!123" → "t@eb eht av$J!123".
    @Test
    public void reverse_shouldReverseOnlyLetters_ifContainsSpecialCharacters() {
        String result = reverseLetter.reverse("J@va the be$t!123");
        Assertions.assertEquals("t@eb eht av$J!123", result);
    }
    //2. Пустая строка "" — результат тоже пустая строка.
    @Test
    public void reverse_shouldReturnEmptyString_ifContainsEmptyString(){
        String result = reverseLetter.reverse("");
        Assertions.assertEquals("", result);
    }
    //3. Одна буква "a" — остаётся как есть.
    @Test
    public void reverse_shouldReturnSingleLetter_ifContainsSingleLetter(){
        String result = reverseLetter.reverse("a");
        Assertions.assertEquals("a", result);
    }
    //4. Строка без букв "123 !@#" — ничего не меняется.
    @Test
    public void reverse_shouldReturnSpecialCharacter_ifContainsSpecialCharacters(){
        String result = reverseLetter.reverse("123 !@#");
        Assertions.assertEquals("123 !@#", result);
    }
    //5. Только буквы "abcd" → "dcba" (обычный разворот).
    @Test
    public void reverse_shouldReverseLetters_ifContainsLetters(){
        String result = reverseLetter.reverse("abcd");
        Assertions.assertEquals("dcba", result);
    }
    //6. Небуквенные символы по краям и в середине — проверьте, что они остались на своих позициях.
    @Test
    public void reverse_shouldKeepSpecialCharastersinPlace_ifContainsSpecialCharacters(){
        String result = reverseLetter.reverse("!ab#cd%");
        Assertions.assertEquals("!dc#ba%", result);
    }
    //7. Регистр — буквы меняются местами вместе со своим регистром (заглавная едет туда, куда едет буква).
    @Test
    public void reverse_shouldKeepSizeofLetter_ifReverseThisLetter(){
        String result = reverseLetter.reverse("AbCd");
        Assertions.assertEquals("dCbA", result);
    }
    //8. Вывод пустой строки со значением null.
    @Test
    public void reverse_shouldReturnEmptyString_ifContainsNull(){
        String result = reverseLetter.reverse(null);
        Assertions.assertEquals("", result);
    }










}
