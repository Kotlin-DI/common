package command

type CommandError struct{}

func (e CommandError) Error() string {
	return "Command execution error."
}
