package command

import "fmt"

type CommandError struct {
	cause error
}

func (e CommandError) Error() string {
	return fmt.Sprintf("Command execution error: %s", e.cause.Error())

}
