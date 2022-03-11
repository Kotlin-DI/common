package command

type ICommand interface {
	Invoke() error
}
