" Enter next operation: 1) View 2) Copy 3) Rename 4) Delete 5) Exit"
#!/bin/bash

echo " File operations: "
ops=" Enter next operation: 1) View 2) Copy 3) Rename 4) Delete 5) Exit"

select operation in View Copy Rename Delete Exit
do
	case $operation in
		View)
			echo " Enter filename to view it: "
			read filename
			cat $filename
			echo "$ops"
 		;;

		Copy)
			echo " Enter filename you want to copy: "
			read filename
			echo " Enter destination: "
			read destination
			cp $filename $destination
			echo " $filename has been copied in $destination. "
			echo "$ops"
		;;

		Rename)
			echo " Enter filename: "
			read filename
			echo " Enter new filename: "
			read rename
			mv $filename $rename
			" $filename has been renamed to $rename. "
			echo "$ops"
		;;

		Delete)
			echo " Enter desired file to be deleted: "
			read filename
			rm $filename
			echo " $filename has been deleted. "
			echo "$ops"
		;;

		Exit)
			echo " Exiting... "
		break
		;;

		*)
			echo " Invalid input. "
			echo " Please input again or Exit "
		;;
	esac
done

