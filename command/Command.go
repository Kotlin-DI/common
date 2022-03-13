package command

type Command struct {
	invoke func() error
}

func (c *Command) Invoke() error {
	return c.invoke()
}
