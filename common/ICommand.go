package common

type Command func() error

type ICommand interface {
	Invoke() error
}
