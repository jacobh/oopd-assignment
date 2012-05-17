class Test {
	public static void main(String[] args) {
		TextFile inputFile;
		inputFile = new TextFile("example.csv", "r");
		inputFile.openFile();
		int highestId = 0;
		int id;
		do {
			if (inputFile.readChar() == ',') {
				do {
					id = inputFile.readInt();
				} while (id == -1);

				System.out.println(id);

				if (highestId < id) {
					highestId = id;
				}
				inputFile.clearRestOfLine();
			}
		} while(inputFile.endOfFile() == false);

		System.out.println(highestId);
	}
}