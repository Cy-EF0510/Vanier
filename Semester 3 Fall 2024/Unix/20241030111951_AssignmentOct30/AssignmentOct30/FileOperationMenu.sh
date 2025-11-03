#!/bin/bash

echo "File Operation Menu: "
echo "Select an operation: "

select operation in View Copy Rename Delete Exit; do
	case $operation in
		View)
			echo " Enter filename to view it: "
			read filename
			cat $filename
 		;;

		Copy)
			echo " Enter filename you want to copy: "
			read filename
			echo " Enter destination: "
			read destination
			cp $filename $destination
			echo " $filename has been copied in $destination. "
		;;

		Rename)
			echo " Enter filename: "
			read filename
			echo " Enter new filename: "
			read rename
			mv $filename $rename
			" $filename has been renamed to $rename. "
		;;

		Delete)
			echo " Enter desired file to be deleted: "
			read filename
			rm $filename
			echo " $filename has been deleted. "
		;;

		Exit)
			echo "Now exiting... "
		break
		;;

		*)
			echo " Invalid input. "
		;;
	esac
done

