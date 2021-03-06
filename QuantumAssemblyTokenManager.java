/* Generated By:JavaCC: Do not edit this line. QuantumAssemblyTokenManager.java */
import java.io.*;
import java.util.*;

/** Token Manager. */
public class QuantumAssemblyTokenManager implements QuantumAssemblyConstants
{

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x1ffc0L) != 0L)
         {
            jjmatchedKind = 22;
            return 5;
         }
         if ((active0 & 0x20L) != 0L)
            return 5;
         return -1;
      case 1:
         if ((active0 & 0x1ffc0L) != 0L)
         {
            jjmatchedKind = 25;
            jjmatchedPos = 1;
            return 5;
         }
         return -1;
      case 2:
         if ((active0 & 0x1fdc0L) != 0L)
         {
            jjmatchedKind = 25;
            jjmatchedPos = 2;
            return 5;
         }
         if ((active0 & 0x200L) != 0L)
            return 5;
         return -1;
      case 3:
         if ((active0 & 0x1fcc0L) != 0L)
         {
            jjmatchedKind = 25;
            jjmatchedPos = 3;
            return 5;
         }
         if ((active0 & 0x100L) != 0L)
            return 5;
         return -1;
      case 4:
         if ((active0 & 0x1f480L) != 0L)
         {
            jjmatchedKind = 25;
            jjmatchedPos = 4;
            return 5;
         }
         if ((active0 & 0x840L) != 0L)
            return 5;
         return -1;
      case 5:
         if ((active0 & 0x7000L) != 0L)
            return 5;
         if ((active0 & 0x18480L) != 0L)
         {
            jjmatchedKind = 25;
            jjmatchedPos = 5;
            return 5;
         }
         return -1;
      case 6:
         if ((active0 & 0x18000L) != 0L)
            return 5;
         if ((active0 & 0x480L) != 0L)
         {
            jjmatchedKind = 25;
            jjmatchedPos = 6;
            return 5;
         }
         return -1;
      case 7:
         if ((active0 & 0x400L) != 0L)
         {
            jjmatchedKind = 25;
            jjmatchedPos = 7;
            return 5;
         }
         if ((active0 & 0x80L) != 0L)
            return 5;
         return -1;
      case 8:
         if ((active0 & 0x400L) != 0L)
         {
            jjmatchedKind = 25;
            jjmatchedPos = 8;
            return 5;
         }
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 44:
         return jjStopAtPos(0, 21);
      case 58:
         return jjStopAtPos(0, 20);
      case 59:
         return jjStopAtPos(0, 19);
      case 65:
         return jjMoveStringLiteralDfa1_0(0x800L);
      case 67:
         return jjMoveStringLiteralDfa1_0(0x2100L);
      case 72:
         return jjStartNfaWithStates_0(0, 5, 5);
      case 73:
         return jjMoveStringLiteralDfa1_0(0x8480L);
      case 77:
         return jjMoveStringLiteralDfa1_0(0x10000L);
      case 78:
         return jjMoveStringLiteralDfa1_0(0x200L);
      case 80:
         return jjMoveStringLiteralDfa1_0(0x40L);
      case 83:
         return jjMoveStringLiteralDfa1_0(0x1000L);
      case 84:
         return jjMoveStringLiteralDfa1_0(0x4000L);
      case 91:
         return jjStopAtPos(0, 17);
      case 93:
         return jjStopAtPos(0, 18);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 68:
         return jjMoveStringLiteralDfa2_0(active0, 0x80L);
      case 69:
         return jjMoveStringLiteralDfa2_0(active0, 0x15000L);
      case 72:
         return jjMoveStringLiteralDfa2_0(active0, 0x40L);
      case 78:
         return jjMoveStringLiteralDfa2_0(active0, 0x8500L);
      case 79:
         return jjMoveStringLiteralDfa2_0(active0, 0x2200L);
      case 80:
         return jjMoveStringLiteralDfa2_0(active0, 0x800L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 65:
         return jjMoveStringLiteralDfa3_0(active0, 0x10040L);
      case 69:
         return jjMoveStringLiteralDfa3_0(active0, 0x80L);
      case 73:
         return jjMoveStringLiteralDfa3_0(active0, 0x400L);
      case 76:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000L);
      case 78:
         return jjMoveStringLiteralDfa3_0(active0, 0x6000L);
      case 79:
         return jjMoveStringLiteralDfa3_0(active0, 0x100L);
      case 80:
         return jjMoveStringLiteralDfa3_0(active0, 0x800L);
      case 84:
         if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(2, 9, 5);
         break;
      case 86:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 67:
         return jjMoveStringLiteralDfa4_0(active0, 0x2000L);
      case 69:
         return jjMoveStringLiteralDfa4_0(active0, 0x9000L);
      case 76:
         return jjMoveStringLiteralDfa4_0(active0, 0x800L);
      case 78:
         return jjMoveStringLiteralDfa4_0(active0, 0x80L);
      case 83:
         return jjMoveStringLiteralDfa4_0(active0, 0x14040L);
      case 84:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(3, 8, 5);
         return jjMoveStringLiteralDfa4_0(active0, 0x400L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 65:
         return jjMoveStringLiteralDfa5_0(active0, 0x2000L);
      case 67:
         return jjMoveStringLiteralDfa5_0(active0, 0x1000L);
      case 69:
         if ((active0 & 0x40L) != 0L)
            return jjStartNfaWithStates_0(4, 6, 5);
         break;
      case 73:
         return jjMoveStringLiteralDfa5_0(active0, 0x400L);
      case 79:
         return jjMoveStringLiteralDfa5_0(active0, 0x4000L);
      case 82:
         return jjMoveStringLiteralDfa5_0(active0, 0x8000L);
      case 84:
         return jjMoveStringLiteralDfa5_0(active0, 0x80L);
      case 85:
         return jjMoveStringLiteralDfa5_0(active0, 0x10000L);
      case 89:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(4, 11, 5);
         break;
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 65:
         return jjMoveStringLiteralDfa6_0(active0, 0x400L);
      case 73:
         return jjMoveStringLiteralDfa6_0(active0, 0x80L);
      case 82:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(5, 14, 5);
         return jjMoveStringLiteralDfa6_0(active0, 0x10000L);
      case 83:
         return jjMoveStringLiteralDfa6_0(active0, 0x8000L);
      case 84:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(5, 12, 5);
         else if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(5, 13, 5);
         break;
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 69:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(6, 15, 5);
         else if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(6, 16, 5);
         break;
      case 76:
         return jjMoveStringLiteralDfa7_0(active0, 0x400L);
      case 84:
         return jjMoveStringLiteralDfa7_0(active0, 0x80L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
static private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 73:
         return jjMoveStringLiteralDfa8_0(active0, 0x400L);
      case 89:
         if ((active0 & 0x80L) != 0L)
            return jjStartNfaWithStates_0(7, 7, 5);
         break;
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
static private int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 90:
         return jjMoveStringLiteralDfa9_0(active0, 0x400L);
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
static private int jjMoveStringLiteralDfa9_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0);
      return 9;
   }
   switch(curChar)
   {
      case 69:
         if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(9, 10, 5);
         break;
      default :
         break;
   }
   return jjStartNfa_0(8, active0);
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 6;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0xff000000000000L & l) != 0L)
                  {
                     if (kind > 27)
                        kind = 27;
                  }
                  if ((0x3000000000000L & l) != 0L)
                  {
                     if (kind > 26)
                        kind = 26;
                     jjCheckNAdd(2);
                  }
                  break;
               case 2:
                  if ((0x3000000000000L & l) == 0L)
                     break;
                  if (kind > 26)
                     kind = 26;
                  jjCheckNAdd(2);
                  break;
               case 3:
                  if ((0xff000000000000L & l) != 0L && kind > 27)
                     kind = 27;
                  break;
               case 5:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 25)
                     kind = 25;
                  jjstateSet[jjnewStateCnt++] = 5;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 22)
                        kind = 22;
                     jjCheckNAdd(5);
                  }
                  if ((0x7fffffe00000000L & l) != 0L)
                  {
                     if (kind > 24)
                        kind = 24;
                  }
                  else if ((0x7fffffeL & l) != 0L)
                  {
                     if (kind > 23)
                        kind = 23;
                  }
                  break;
               case 1:
                  if ((0x7fffffe00000000L & l) != 0L && kind > 24)
                     kind = 24;
                  break;
               case 4:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 22)
                     kind = 22;
                  jjCheckNAdd(5);
                  break;
               case 5:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 25)
                     kind = 25;
                  jjCheckNAdd(5);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 6 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, "\110", "\120\110\101\123\105", 
"\111\104\105\116\124\111\124\131", "\103\116\117\124", "\116\117\124", 
"\111\116\111\124\111\101\114\111\132\105", "\101\120\120\114\131", "\123\105\114\105\103\124", 
"\103\117\116\103\101\124", "\124\105\116\123\117\122", "\111\116\126\105\122\123\105", 
"\115\105\101\123\125\122\105", "\133", "\135", "\73", "\72", "\54", null, null, null, null, null, null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0xfffffe1L, 
};
static final long[] jjtoSkip = {
   0x1eL, 
};
static protected SimpleCharStream input_stream;
static private final int[] jjrounds = new int[6];
static private final int[] jjstateSet = new int[12];
static protected char curChar;
/** Constructor. */
public QuantumAssemblyTokenManager(SimpleCharStream stream){
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}

/** Constructor. */
public QuantumAssemblyTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
static private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 6; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
static public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

}
