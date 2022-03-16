package uobject

import (
	"github.com/IoC-Tools/common"
)

type Getter[T common.Any] interface {
	Get(string) (T, error)
}
