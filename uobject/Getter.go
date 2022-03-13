package uobject

import (
	"github.com/IoC-Tools/common"
)

type Getter interface {
	Get(string) (common.Any, error)
}
