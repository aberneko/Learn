package com.aberneko.learning.Git;

public class Git {
    static void main() {

        // commit f9bd906861422db0f87130e710b64a669af02faf (HEAD -> main, origin/main, origin/HEAD)
        System.out.println(
                "f9bd906861422db0f87130e710b64a669af02faf --> хэш - идентификатор комита " +
                " получается с помощью алгоритма SHA - 1. В то время как результат работы HashCode()" +
                " - это целое число, хэширование в GIT - Символьная строка состоящая из 40 символов." +
                " Все хэши и таблицу Git сохраняет в служебные файлы. Они находятся в скрытой папке .git" +
                " в репозитории проекта"
        );

        /*
         commit f9bd906861422db0f87130e710b64a669af02faf (HEAD -> main, origin/main, origin/HEAD)              - ХЭШ
         Author: WorkAberneko <kurumi.06.10.t@gmail.com>                                             - АВТОР КОММИТА
         Date:   Wed Feb 11 15:48:02 2026 +0300                                                       - ДАТА КОММИТА
         Изменения структыры 2.0                                                                - ИНФОРМАЦИЯ КОММИТА
        */


        // Сокращённый лог
        System.out.println(
                " Сокращённый лог вызывают командой 'git log' c флагом '--oneline' при этом в терминале " +
                " появляются только первые несколько символов хэша каждого комита и комментарии к ним" +
                ""
                );
    }



}
