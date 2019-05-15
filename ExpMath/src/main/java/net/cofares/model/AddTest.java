package net.cofares.model;


import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Classe-test AddTest.
 *
 * @author  (votre nom)
 * @version (un num�ro de version ou une date)
 *
 * Les classes-test sont document�es ici :
 * http://junit.sourceforge.net/javadoc/junit/framework/TestCase.html
 * et sont bas�es sur le document � 2002 Robert A. Ballance intitul�
 * "JUnit: Unit Testing Framework".
 *
 * Les objets Test (et TestSuite) sont associ�s aux classes � tester
 * par la simple relation yyyTest (e.g. qu'un Test de la classe Name.java
 * se nommera NameTest.java); les deux se retrouvent dans le m?me paquetage.
 * Les "engagements" (anglais : "fixture") forment un ensemble de conditions
 * qui sont vraies pour chaque m�thode Test � ex�cuter.  Il peut y avoir
 * plus d'une m�thode Test dans une classe Test; leur ensemble forme un
 * objet TestSuite.
 * BlueJ d�couvrira automatiquement (par introspection) les m�thodes
 * Test de votre classe Test et g�n�rera la TestSuite cons�quente.
 * Chaque appel d'une m�thode Test sera pr�c�d� d'un appel de setUp(),
 * qui r�alise les engagements, et suivi d'un appel � tearDown(), qui les
 * d�truit.
 */
public class AddTest
{
    // D�finissez ici les variables d'instance n�cessaires � vos engagements;
    /**
     * Constructeur de la classe-test AddTest
     */
    public AddTest()
    {
    }

    /**
     * Met en place les engagements.
     *
     * M�thode appel�e avant chaque appel de m�thode de test.
     */
    @Before
    public void setUp() // throws java.lang.Exception
    {

    }

    /**
     * Supprime les engagements
     *
     * M�thode appel�e apr�s chaque appel de m�thode de test.
     */
    @After
    public void tearDown() // throws java.lang.Exception
    {
        //Lib�rez ici les ressources engag�es par setUp()
    }

    @Test
    public void testCreate()
    {
        net.cofares.model.Add add1 = net.cofares.model.Add.create(Const.create(10), Const.create(20));
        net.cofares.model.Const const1 = (net.cofares.model.Const)add1.eval();
        assertEquals(Const.create(30), const1);
        assertEquals((Integer)30, add1.evalNum());
        assertEquals("(Const:10+Const:20)", add1.show());
    }
}

