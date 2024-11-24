import os

def rename_txt_to_java(folder_path):
    try:
        # Ensure the folder exists
        if not os.path.exists(folder_path):
            print(f"Error: The folder '{folder_path}' does not exist.")
            return

        # Get a list of all files in the folder
        files = os.listdir(folder_path)

        # Iterate through the files
        for file in files:
            # Check if the file ends with .txt
            if file.endswith('.txt'):
                # Generate the new filename
                new_name = file.replace('.txt', '.java')
                # Get full file paths
                old_path = os.path.join(folder_path, file)
                new_path = os.path.join(folder_path, new_name)
                # Rename the file
                os.rename(old_path, new_path)
                print(f"Renamed: {file} -> {new_name}")

        print("Renaming complete.")
    except Exception as e:
        print(f"An error occurred: {e}")

# Example usage
folder_name = input("Enter the folder path: ")
rename_txt_to_java(folder_name)
