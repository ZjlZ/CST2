/**
 * 
 * @since 2014-09-15
 * @author larsozac000
 *
 *	This is a test bed for splitting it all up into parts
 *	Vertical bars are included in whole block of word(s)
 *	Horizontal bars are called apart form word(s)
 *
 *	AND this entire build survives on copying and pasting
 *
 */

public class TestEffciency 
{
				
//tools spaces
	//Small parts	
			//System.out.print("Cursor");
			public static void spc()	//Spacebar
			{
				System.out.print(" "); 
			}
			public static void spck() //Spacebar with a Kick
			{	
				System.out.println(" ");
			}
			public static void vt()	//Vertical Line
			{
				System.out.print(" | ");
			}
			public static void hz()	//Horizontal Line
			{
				System.out.print("-");
			}
			public static void pl() //plus!
			{
				System.out.print("+");
			}
			public static void hz_pl()  //Horizontal and plus (whole piece)
			{
				hz();hz();hz();hz();hz();hz();hz();hz();hz();hz();
				pl();
/*WHY?????*/	hz();hz();hz();hz();hz();hz();hz();hz();hz();hz();hz(); //WHY IS THIS AN EXTRA ?????????
				pl();
				hz();hz();hz();hz();hz();hz();hz();hz();hz();hz();
				spck();
			}
//Block Letters
	//Z
			public static void Z() 
			
			{
				z1(); 
					System.out.println();
				z2();
					System.out.println();
				z3();
					System.out.println();
				z4();
					System.out.println();
				z5();
					System.out.println();
				z6();
					System.out.println();
				z7();
					System.out.println();
				z8();
					System.out.println();
				z9();
					System.out.println();
			}	
			public static void threeZ() //Z BLOCK of Three with LINES
			{
				z1();
				vt();
				z1();
				vt();
				z1();
				spck();
				z2();
				vt();
				z2();
				vt();
				z2();
				spck();
				z3();
				vt();
				z3();
				vt();
				z3();
				spck();
				z4();
				vt();
				z4();
				vt();
				z4();
				spck();
				z5();
				vt();
				z5();
				vt();
				z5();
				spck();
				z6();
				vt();
				z6();
				vt();
				z6();
				spck();
				z7();
				vt();
				z7();
				vt();
				z7();
				spck();
				z8();
				vt();
				z8();
				vt();
				z8();
				spck();
				z9();
				vt();
				z9();
				vt();
				z9();
				spck();
			}
			/*	MAP
		 	1("ZZZZZZZZZ");
			2("ZZZZZZZZZ");
			3("       ZZ");
			4("     ZZ  ");
			5("   ZZ    ");
			6(" ZZ      ");
			7("ZZ       ");
			8("ZZZZZZZZZ");
			9("ZZZZZZZZZ");
			 */
				public static void z1() 	
				{
				System.out.print("ZZZZZZZZZ");
				}
				public static void z2()
				{
				System.out.print("ZZZZZZZZZ");
				}
				public static void z3()
				{
				System.out.print("       ZZ");
				}
				public static void z4()
				{
				System.out.print("     ZZ  ");
				}
				public static void z5()
				{
				System.out.print("   ZZ    ");
				}
				public static void z6()
				{
				System.out.print(" ZZ      ");
				}
				public static void z7()
				{
				System.out.print("ZZ       ");
				}
				public static void z8()
				{
				System.out.print("ZZZZZZZZZ");
				}
				public static void z9()
				{
				System.out.print("ZZZZZZZZZ");
				}
	//J			
			public static void J()
			{
			j1(); 
				System.out.println();
			j2();
				System.out.println();
			j3();
				System.out.println();
			j4();
				System.out.println();
			j5();
				System.out.println();
			j6();
				System.out.println();
			j7();
				System.out.println();
			j8();
				System.out.println();
			j9();
				System.out.println();
			}
			public static void threeJ()
				{
					j1();
					vt();
					j1();
					vt();
					j1();
					spck();
					j2();
					vt();
					j2();
					vt();
					j2();
					spck();
					j3();
					vt();
					j3();
					vt();
					j3();
					spck();
					j4();
					vt();
					j4();
					vt();
					j4();
					spck();
					j5();
					vt();
					j5();
					vt();
					j5();
					spck();
					j6();
					vt();
					j6();
					vt();
					j6();
					spck();
					j7();
					vt();
					j7();
					vt();
					j7();
					spck();
					j8();
					vt();
					j8();
					vt();
					j8();
					spck();
					j9();
					vt();
					j9();
					vt();
					j9();
					spck();
				}
			/*	MAP
			   *System.out.println("JJJJJJJJJ");
				System.out.println("JJJJJJJJJ");
				System.out.println("     JJ  ");
				System.out.println("     JJ  ");
				System.out.println("     JJ  ");
				System.out.println("     JJ  ");
				System.out.println("JJ   JJ  ");
				System.out.println("JJJJJJJ  ");
				System.out.println("JJJJJJJ  ");
			 * 
			 */
				public static void j1()
				{
				System.out.print("JJJJJJJJJ");
				}
				public static void j2()
				{
				System.out.print("JJJJJJJJJ");
				}
				public static void j3()
				{
				System.out.print("     JJ  ");
				}
				public static void j4()
				{
				System.out.print("     JJ  ");
				}
				public static void j5()
				{
				System.out.print("     JJ  ");
				}
				public static void j6()
				{
				System.out.print("     JJ  ");
				}
				public static void j7()
				{
				System.out.print("JJ   JJ  ");
				}
				public static void j8()
				{
				System.out.print("JJJJJJJ  ");
				}
				public static void j9()
				{
				System.out.print("JJJJJJJ  ");
				}
	//L		
			public static void L()
			{
			l1(); 
				System.out.println();
			l2();
				System.out.println();
			l3();
				System.out.println();
			l4();
				System.out.println();
			l5();
				System.out.println();
			l6();
				System.out.println();
			l7();
				System.out.println();
			l8();
				System.out.println();
			l9();
				System.out.println();
			}
			public static void threeL()
				{
				l1();
				vt();
				l1();
				vt();
				l1();
				spck();
				l2();
				vt();
				l2();
				vt();
				l2();
				spck();
				l3();
				vt();
				l3();
				vt();
				l3();
				spck();
				l4();
				vt();
				l4();
				vt();
				l4();
				spck();
				l5();
				vt();
				l5();
				vt();
				l5();
				spck();
				l6();
				vt();
				l6();
				vt();
				l6();
				spck();
				l7();
				vt();
				l7();
				vt();
				l7();
				spck();
				l8();
				vt();
				l8();
				vt();
				l8();
				spck();
				l9();
				vt();
				l9();
				vt();
				l9();
				spck();
				}
			/*	MAP
			System.out.print("LL       ");
			System.out.print("LL       ");
			System.out.print("LL       ");
			System.out.print("LL       ");
			System.out.print("LL       ");
			System.out.print("LL       ");
			System.out.print("LL       ");
			System.out.print("LLLLLLLLL");
			System.out.print("LLLLLLLLL");
			 */
				public static void l1()
				{
					System.out.print("LL       ");
				}
				public static void l2()
				{
					System.out.print("LL       ");
				}
				public static void l3()
				{
					System.out.print("LL       ");
				}
				public static void l4()
				{
					System.out.print("LL       ");
				}
				public static void l5()
				{
					System.out.print("LL       ");
				}
				public static void l6()
				{
					System.out.print("LL       ");
				}
				public static void l7()
				{
					System.out.print("LL       ");
				}
				public static void l8()
				{
					System.out.print("LLLLLLLLL");
				}
				public static void l9()
				{
					System.out.print("LLLLLLLLL");
				}
				
//WHOLE STUFF
			
		public static void blockZ() //the block with lines to complete it
			{
			threeZ();
				hz_pl();
			threeZ();
				hz_pl();
			threeZ();
			}
		public static void blockJ()
		{
		threeJ();
			hz_pl();
		threeJ();
			hz_pl();
		threeJ();
		}
		public static void blockL()
		{
		threeL();
			hz_pl();
		threeL();
			hz_pl();
		threeL();
		}
		
		public static void ZJL()
		{
			z1();
			vt();
			j1();
			vt();
			l1();
			spck();
			z2();
			vt();
			j2();
			vt();
			l2();
			spck();
			z3();
			vt();
			j3();
			vt();
			l3();
			spck();
			z4();
			vt();
			j4();
			vt();
			l4();
			spck();
			z5();
			vt();
			j5();
			vt();
			l5();
			spck();
			z6();
			vt();
			j6();
			vt();
			l6();
			spck();
			z7();
			vt();
			j7();
			vt();
			l7();
			spck();
			z8();
			vt();
			j8();
			vt();
			l8();
			spck();
			z9();
			vt();
			j9();
			vt();
			l9();
			spck();
		}
		public static void JLZ()
		{
			j1();
			vt();
			l1();
			vt();
			z1();
			spck();
			j2();
			vt();
			l2();
			vt();
			z2();
			spck();
			j3();
			vt();
			l3();
			vt();
			z3();
			spck();
			j4();
			vt();
			l4();
			vt();
			z4();
			spck();
			j5();
			vt();
			l5();
			vt();
			z5();
			spck();
			j6();
			vt();
			l6();
			vt();
			z6();
			spck();
			j7();
			vt();
			l7();
			vt();
			z7();
			spck();
			j8();
			vt();
			l8();
			vt();
			z8();
			spck();
			j9();
			vt();
			l9();
			vt();
			z9();
			spck();
			
		}
		public static void LZJ()
		{
			l1();
			vt();
			z1();
			vt();
			j1();
			spck();
			l2();
			vt();
			z2();
			vt();
			j2();
			spck();
			l3();
			vt();
			z3();
			vt();
			j3();
			spck();
			l4();
			vt();
			z4();
			vt();
			j4();
			spck();
			l5();
			vt();
			z5();
			vt();
			j5();
			spck();
			l6();
			vt();
			z6();
			vt();
			j6();
			spck();
			l7();
			vt();
			z7();
			vt();
			j7();
			spck();
			l8();
			vt();
			z8();
			vt();
			j8();
			spck();
			l9();
			vt();
			z9();
			vt();
			j9();
			spck();
			
		}
		public static void COMBO()
		{
			ZJL();
			hz_pl();
			JLZ();
			hz_pl();
			LZJ();
		}
		
/*
 * TrashArchive
 

		public static void trashJ() {
			System.out.println("JJJJJJJJJ");
			System.out.println("JJJJJJJJJ");
			System.out.println("     JJ  ");
			System.out.println("     JJ  ");
			System.out.println("     JJ  ");
			System.out.println("     JJ  ");
			System.out.println("JJ   JJ  ");
			System.out.println("JJJJJJJ  ");
			System.out.println("JJJJJJJ  ");
			System.out.println();
		}
		public static void trashL() {
			System.out.print("LL       ");
			System.out.print("LL       ");
			System.out.print("LL       ");
			System.out.print("LL       ");
			System.out.print("LL       ");
			System.out.print("LL       ");
			System.out.print("LL       ");
			System.out.print("LLLLLLLLL");
			System.out.print("LLLLLLLLL");
			System.out.println();
	}
		   J with NO VERTICAL BARS!!!!!!!!!!
		   public static void threeJ()
			{
				j1();
				spc();
				j1();
				spc();
				j1();
				spck();
				j2();
				spc();
				j2();
				spc();
				j2();
				spck();
				j3();
				spc();
				j3();
				spc();
				j3();
				spck();
				j4();
				spc();
				j4();
				spc();
				j4();
				spck();
				j5();
				spc();
				j5();
				spc();
				j5();
				spck();
				j6();
				spc();
				j6();
				spc();
				j6();
				spck();
				j7();
				spc();
				j7();
				spc();
				j7();
				spck();
				j8();
				spc();
				j8();
				spc();
				j8();
				spck();
				j9();
				spc();
				j9();
				spc();
				j9();
				spck();
			}
		 */
		
//main		
		//Try:
		//threeZ(), threeL(), hz_pl(), blockJ(), etc
	public static void main(String[] args)
		{
			COMBO();
		}
	
}
