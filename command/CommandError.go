package command

import "fmt"

type CommandError struct {
	cause string
}

func (e CommandError) Error() string {
	return fmt.Sprintf("Command execution error: %s", e.cause)

}
