/*
 * import java.io.BufferedReader; import java.io.FileNotFoundException; import
 * java.io.FileReader; import java.io.IOException; import java.util.Scanner;
 * 
 * public class c2cLocal {
 * 
 * public String[] bases = {"foundation", "passion", "manifestation",
 * "compassion", "expression", "obsevation", "conception"}; public String
 * basesString = "foundation, passion, manifestation, compassion, " +
 * "expression, obsevation, conception"; public String[] categories = new
 * String[37]; public String[] patterns = new String[6]; public String row = "";
 * public String theme = ""; public Scanner nerve = new Scanner(System.in);
 * 
 * public c2cLocal() {a try { BufferedReader patReader = new BufferedReader(new
 * FileReader(
 * "C:/Users/Andrew/eclipse-workspace/C2cScope/src/BaseCategories.txt")); for
 * (int i = 0; i < patterns.length; i++) { this.categories[i] =
 * patReader.readLine(); //System.out.println(this.patterns[i]); }
 * patReader.close();
 * 
 * } catch (FileNotFoundException e) {e.printStackTrace();} catch (IOException
 * e) {e.printStackTrace(); } }
 * 
 * public String getPattern(int intent, int pos) { if (pos == 7) return
 * this.patterns[intent]; else return }
 * 
 * public String getRow(int intent) { System.out.println(intent);
 * System.arraycopy(this.categories, (intent)*6, this.patterns, 0, 6); this.row
 * = String.join(",", this.patterns[6]); return this.row; }
 * 
 * public String getTheme(int intent, int passion) { return this.theme =
 * this.categories[intent*passion]; }
 * 
 * public String getTheme(int id) { return this.theme = this.categories[id]; }
 * 
 * 
 * 
 * }
 */