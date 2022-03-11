package common

type ICommand interface {
	Invoke() error
}
