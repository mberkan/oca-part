package pl.mberkan.oca.part1;

/**
 * Example of identifiers
 */
public class JIdentifiers {

    // valid:
    int $ = 1;
    int _$ = 2;
    int $1 = 3;
    int $_2 = 4;

    // invalid:

    // int 1xxx = 5; // <-- digit can't be on the first place
    // int %xxx = 6; // <-- other chars than _ and $ is not allowed

    // reserved words:
    // abstract  assert     boolean   break        byte
    // case      catch      char      class        const*
    // continue  default    do        double       else
    // enum      extends    false     final        finally
    // float     for        goto      if           implements
    // import    instanceof int       interface    long
    // native    new        null      package      private
    // protected public     return    short        static
    // strictfp  super      switch    synchronized this
    // throw     throws     transient true         try
    // void      volatile   while
}
