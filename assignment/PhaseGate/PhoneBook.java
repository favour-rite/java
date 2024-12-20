public class PhoneBook{
	public static void main(String[] args){
	
        	System.out.println("""  
					========================

					1. Add Contact\n
					2. Search by Name\n
					3. Delete Contact\n
					4. Display Contacts\n
					5. Dial Contact\n
					6. Exit 

					========================
			  	""");
        	int choice = int(input("Enter your choice: "));

        	if (choice == 1){
            		addContact();
		}
        	else if (choice == 2){
            		searchByName();
		}
        	else if (choice == 3){
			deleteContact();
		}
        	else if (choice == 4){
			displayContacts();
		}
        	else if (choice == 5){
			dialContact();
		}
        	else if (choice == 6){
			System.out.print(0);

            print(" Exiting... ");
        else if{
            print(" try again... ");
	}
	public static addContact(){

   	System.out.println("Enter phone number: ");
	int phoneNumber = userInput.nextInt();

	System.out.println("Enter name: ");
	int name = userInput.nextInt();

	contacts[name] = phone_number

    	if len(phone_number) > 11:
        print("Invalid number.")
        return
    contact = {"name": name , "phone number": phone_number}
    contacts.append("+234", contact)
    print(f"contact {name} added successfully")
	}
def search_by_name():

    name = input("Enter name to search: ")
    if name in contacts:
        print("Search Results:")
        print(contacts[name])
    else:
        print("Contact not found!\n")


def delete_contact():

    name = input("Enter name to delete: ")

    if name in contacts:
        del contacts[name]
        print(f"Contact '{name}' deleted successfully.")
    else:
        print(f"Contact '{name}' not found.")

def dial_contact():

    name = input("Enter name to dial: ")
    if name in contacts:
        print(f"Dialing {name} - {contacts[name]}")
    else:
        print(f"Contact '{name}' not found.")

def display_contacts():

    if contacts:
        print("Contacts:")
        for name, phone_number in contacts.items():
            print(f"{name}")
            print(f"{phone_number}")
    else:
        print("No contacts available.")
contacts = []
main()

