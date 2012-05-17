class Csv
{
	private static String filepath;

	public Csv(String inFilepath)
	{
		filepath = new String(inFilepath);
	}

	public static int calcHighestId()
	{
		// goes through each line if the csv file, keeping track of the highest
		// id it finds. returns the highest id found in the csv file.
		int id;
		int highestId = 0;
		TextFile file;
		file = new TextFile(filepath, "r");
		file.openFile();
		do 
		{
			if (file.readChar() == ',') 
			{
				do 
				{
					id = file.readInt();
				} while (id == -1);

				if (highestId < id) 
				{
					highestId = id;
				}
				file.clearRestOfLine();
			}
		} while(file.endOfFile() == false);
		file.closeFile();
		return highestId;
	}
	public static void appendRecord()
	{
//		String formattedRecord;

//		formattedRecord = String.format(
//			"%s,%d,%s,%s,%d,%d,%d,%d,%d,%d,%s",
//			type,
//			id,
//			addressNumber,
//			addressStreet,
//			addressPostcode,
//			dateDay,
//			dateMonth,
//			dateYear,
//			timeHour,
//			timeMinute,
//			parentSpecificVariable,
//		);
	}
}
"this" + some_variable + "something else"