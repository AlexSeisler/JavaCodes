import os

def get_file_names(folder_path):
    """
    Retrieves the names of all files in a specified folder and creates a list.

    :param folder_path: Path to the folder
    :return: List of file names (strings)
    """
    try:
        # Get all entries (files and directories) in the folder
        entries = os.listdir(folder_path)
        
        # Create a list of file names, filtering out directories
        file_names = [entry for entry in entries if os.path.isfile(os.path.join(folder_path, entry))]
        
        return file_names
    except FileNotFoundError:
        print(f"Error: The folder '{folder_path}' does not exist.")
        return []
    except Exception as e:
        print(f"An error occurred: {e}")
        return []

# Main function
if __name__ == "__main__":
    folder_path = "JavaCodes"  # Replace with your folder path
    
    # Get list of file names
    file_names = get_file_names(folder_path)
    
    # Print the list of file names
    print(file_names)
